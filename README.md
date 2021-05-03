## Java-Disassembler
A disassembler that outputs jvm bytecode and a buncha other details from .class files. Uses (ClassReader)[https://github.com/pranavgade20/ClassReader] library.

### Usage
Compile your .java file `javac Test.java`

Run io.giuthub.pranavgade20.jdsm.Main and pass the .class file generated above as the first command line argument: 
`java Main Test.java`

Remember to include the library from https://github.com/pranavgade20/ClassReader

###Output
The above command produces the following output:
```
Public Test extends java/lang/Object


Static abcabc I


Public <init> ()V
	ALOAD_0 
	INVOKESPECIAL 0 1
	RETURN 
	
Public,Static main ([Ljava/lang/String;)V
	ICONST_0 
	ISTORE_1 
	ILOAD_1 
	BIPUSH 10
	IF_ICMPGE 0 13
	ILOAD_1 
	INVOKEVIRTUAL 0 2
	IINC 1 1
	GOTO -1 -13
	GETSTATIC 0 3
	LDC 4
	INVOKESTATIC 0 5
	RETURN 
	
Static doubler (I)V
	GETSTATIC 0 3
	ICONST_2 
	ILOAD_0 
	IMUL 
	INVOKESTATIC 0 6
	RETURN 
	
Static <clinit> ()V
	BIPUSH 23
	PUTSTATIC 0 7
	RETURN
```