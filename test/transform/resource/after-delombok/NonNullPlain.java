//version 8:
import java.lang.annotation.*;
class NonNullPlain {
	@lombok.NonNull
	int i;
	@lombok.NonNull
	String s;
	@NotNull
	Object o;
	@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
	@Retention(RetentionPolicy.CLASS)
	public @interface NotNull {
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public NonNullPlain(@lombok.NonNull final int i, @lombok.NonNull final String s) {
		if (s == null) {
			throw new java.lang.NullPointerException("s is marked non-null but is null");
		}
		this.i = i;
		this.s = s;
	}
	@lombok.NonNull
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int getI() {
		return this.i;
	}
	@lombok.NonNull
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public String getS() {
		return this.s;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public Object getO() {
		return this.o;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setI(@lombok.NonNull final int i) {
		this.i = i;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setS(@lombok.NonNull final String s) {
		if (s == null) {
			throw new java.lang.NullPointerException("s is marked non-null but is null");
		}
		this.s = s;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setO(final Object o) {
		this.o = o;
	}
}
