package ma.education.tp2.reflection;

import ma.education.tp1.introduction.Salle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        //Salle o1=new Salle();
        Salle.affiche(0,"Salle Informatique");
        Salle.affiche(2,"Salle des cours");
        Class SLc = Salle.class;
        Field[] f = SLc.getDeclaredFields();
        for (int i =0;i<f.length;i++)
        {
            System.out.println(f[i].getName());

        }
        Method[] m = SLc.getDeclaredMethods();
        for (int i =0;i<m.length;i++)
        {
            System.out.println(m[i].getName());

        }
        Constructor C[] =SLc.getDeclaredConstructors();
        for (int i =0;i<C.length;i++)
        {
            System.out.println(C[i].getName());

        }
    }
}
