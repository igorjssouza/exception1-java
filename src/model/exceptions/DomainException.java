package model.exceptions;

public class DomainException extends RuntimeException {
	// default serial, será explicado depois
	private static final long serialVersionUID = 1L;

	// construtor foi feito dessa forma para permitir q a exceção personalizada seja
	// instanciada e passe uma msg
	public DomainException(String msg) {
		super(msg);
	}

}
