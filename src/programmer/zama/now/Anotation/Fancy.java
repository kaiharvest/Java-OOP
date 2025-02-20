package programmer.zama.now.Anotation;

public @interface Fancy {

	String name();

	String[] tag() default {};

}
