## Java-Disassembler
A disassembler that outputs jvm bytecode and a buncha other details from .class files. Uses (ClassReader)[https://github.com/pranavgade20/ClassReader] library.

### Usage
Compile your .java file `javac Test.java`

Run io.giuthub.pranavgade20.jdsm.Main and pass the .class file generated above as the first command line argument: 
`java Main Test.java`

Remember to include the library from https://github.com/pranavgade20/ClassReader

#### From prebuilt jar
Download the latest jar from the releases tab, and run it: `java -jar Java-Disassembler.jar Test.class`

### Output
The above command produces the following output:
```
Public class Test extends java/lang/Object


Static abcabc I


Public <init> ()V
        ALOAD_0
        INVOKESPECIAL 0x0 0x1
        RETURN
        
Public,Static main ([Ljava/lang/String;)V
        ICONST_0
        ISTORE_1
        ILOAD_1
        BIPUSH 0xa
        IF_ICMPGE 0x0 0xd
        ILOAD_1
        INVOKEVIRTUAL 0x0 0x2
        IINC 0x1 0x1
        GOTO 0xff 0xf3
        GETSTATIC 0x0 0x3
        LDC 0x4
        INVOKESTATIC 0x0 0x5
        RETURN
        
Static doubler (I)V
        GETSTATIC 0x0 0x3
        ICONST_2
        ILOAD_0
        IMUL
        INVOKESTATIC 0x0 0x6
        RETURN
        
Static <clinit> ()V
        BIPUSH 0x17
        PUTSTATIC 0x0 0x7
        RETURN
        
```