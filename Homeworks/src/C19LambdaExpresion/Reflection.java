package C19LambdaExpresion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

        public static void list() {
            Class vehicle = C19LambdaExpresion.Vehicle.class;
            Method[] methods = vehicle.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println(method.getName());
            }
        }

        // metoda cu numar nedeterminat de parametri (observa '...')
        public static Object invocareMetodaPrinReflection(Object obj, String numeMetoda,
                Object... setDeParametri) {
            int numarParametri = setDeParametri.length;
            Method metodaApelata;
            Object valoareReturn = null;
            Class<?>[] tipurileParametrilor = new Class<?>[numarParametri];
            for (int i = 0; i < numarParametri; i++) {
                tipurileParametrilor[i] = setDeParametri[i].getClass();
            }
            try {
                metodaApelata = obj.getClass().getDeclaredMethod(
                        numeMetoda, tipurileParametrilor);
                metodaApelata.setAccessible(true);
                valoareReturn = metodaApelata.invoke(obj, setDeParametri);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return valoareReturn;
        }

        public static void main(String[] args) {
            C19LambdaExpresion.Vehicle vehicle = new C19LambdaExpresion.Vehicle("123", 4, "car");
            new Reflection().list(); // listeaza metodele

            Method primaMetoda = C19LambdaExpresion.Vehicle.class.getDeclaredMethods()[0]; // prima metoda
            Method aDouaMetoda = C19LambdaExpresion.Vehicle.class.getDeclaredMethods()[1]; //a doua metoda
            System.out.println(invocareMetodaPrinReflection(vehicle, primaMetoda.getName()));
            System.out.println(" ");

            System.out.println(aDouaMetoda.getName());
            System.out.println(aDouaMetoda.getParameters());
            System.out.println(invocareMetodaPrinReflection(vehicle, aDouaMetoda.getName(), (Object[]) aDouaMetoda.getParameters()));
            //eroare la parametri!!!!!
        }
}
