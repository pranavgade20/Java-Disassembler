package io.github.pranavgade20.jdsm;

import io.github.pranavgade20.classexplorer.FieldInfo;
import io.github.pranavgade20.classexplorer.Klass;
import io.github.pranavgade20.classexplorer.MethodInfo;
import io.github.pranavgade20.classexplorer.attributeinfo.AttributeInfo;
import io.github.pranavgade20.classexplorer.attributeinfo.CodeAttribute;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File(args[0]);
        if (!file.isFile()) {
            System.out.println("Please select a valid file.");
            return;
        }

        try {
            Klass klass = new Klass(new FileInputStream(file));

            System.out.println(klass.access_flags.toString() + " class " + klass.this_class.name + " extends " + klass.super_class.name);
            System.out.println();
            System.out.println();

            for (FieldInfo field : klass.fields) {
                System.out.println(field.access_flags.toString() + " " + field.name + " " + field.descriptor);
            }
            System.out.println();
            System.out.println();

            for (MethodInfo method : klass.methods) {
                System.out.println(method.access_flags.toString() + " " + method.name + " " + method.descriptor);
                for (AttributeInfo attribute : method.attributes) {
                    if (attribute instanceof CodeAttribute) {
                        System.out.println("\t" + ((CodeAttribute) attribute).code.toString().replaceAll("\n", "\n\t"));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("oops, something went wrong, here's more information:\n");
            e.printStackTrace();
        }
    }
}
