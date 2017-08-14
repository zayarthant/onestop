package com.jdc.home.repository;

import com.jdc.home.domain.State;

public class StateRepository extends AbstractRepository<State> {

	@Override
	protected Class<State> type() {
		return State.class;
	}

}
