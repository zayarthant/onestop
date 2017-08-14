package com.jdc.home.utils.search;

import java.util.HashMap;
import java.util.Map;

import com.jdc.home.domain.Agency.Type;
import com.jdc.home.domain.State;
import com.jdc.home.domain.Township;

public class SearchAgency implements Searchable, Sortable, PageEnable {

	public SearchAgency() {
	}

	private Type type;

	private State state;

	private Township township;
	
	private int start;
	private int limit;

	public String where() {
		
		StringBuffer sb = new StringBuffer();
		
		// type
		if(null != type) {
			sb.append("and t.type = :type ");
		}
		
		// township
		if(null != township) {
			sb.append("and t.address.township = :township ");
		} else {
			// state
			if(null != state) {
				sb.append("and t.address.township.state = :state ");
			}
		}

		return sb.toString().isEmpty() ? "" : sb.insert(0, "where 1 = 1 ").toString();
	}

	public Map<String, Object> params() {
		
		Map<String, Object> params = new HashMap<>();
		
		// type
		if(null != type) {
			params.put("type", type);
		}
		
		// township
		if(null != township) {
			params.put("township", township);
		} else {
			// state
			if(null != state) {
				params.put("state", state);
			}
		}

		return params;
	}

	public String sort() {
		return "order by t.security.creation desc";
	}

	public int start() {
		return getStart();
	}

	public int limit() {
		return getLimit();
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Township getTownship() {
		return township;
	}

	public void setTownship(Township township) {
		this.township = township;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

}