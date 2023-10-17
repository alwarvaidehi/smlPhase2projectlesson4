package phase2lesson4Facebook;



	import java.lang.annotation.ElementType;
	import java.lang.annotation.Retention;
	import java.lang.annotation.Target;
	import java.lang.annotation.RetentionPolicy;
	import org.junit.jupiter.api.Tag;
	import org.junit.jupiter.api.Test;
	public class MyOwnAnnotation {

	      @Target({ElementType.TYPE, ElementType.METHOD})
	      @Retention(RetentionPolicy.RUNTIME)
	      @Tag("openbrowser")
	      @Test
	      public @interface MyTest {
	     
	}


}
