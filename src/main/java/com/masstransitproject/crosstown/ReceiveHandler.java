package com.masstransitproject.crosstown;

import com.masstransitproject.crosstown.context.ReceiveContext;

/**
 * In .Net RecieveContexts leverage lambdas. Without function pointers in JDK
 * 1.6 We provide an interface to be invoked when ReceiveContext receives a
 * message.
 * 
 * @param <T>
 */
public interface ReceiveHandler<T> {

	// Needs an onMessage method
	public ReceiveAction<T> lookupAction(ReceiveContext<T> context);
}
