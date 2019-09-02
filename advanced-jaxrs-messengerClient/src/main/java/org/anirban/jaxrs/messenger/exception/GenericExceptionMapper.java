package org.anirban.jaxrs.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.anirban.jaxrs.messenger.model.ErrorMessage;

// This class intentionally doesn't have the @Provider annotation.
// It has been disabled in order to try out other ways of throwing exceptions in JAX-RS

// @Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 500, "https://en.wikipedia.org/wiki/HTTP_404");
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(errorMessage)
				.build();
	}

}