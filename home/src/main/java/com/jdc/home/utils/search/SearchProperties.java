package com.jdc.home.utils.search;

import java.util.Map;

import com.jdc.home.domain.Propertiy.OperationType;
import com.jdc.home.domain.Propertiy.PropertyType;
import com.jdc.home.domain.State;
import com.jdc.home.domain.Township;

public class SearchProperties implements Searchable, Sortable, PageEnable {

    public SearchProperties() {
    }

    private OperationType operation;

    private PropertyType propType;

    private State state;

    private Township township;

    private double minPrice;

    private double maxPrice;

    public String where() {
        // TODO implement here
        return "";
    }

    public Map<String, Object> params() {
        // TODO implement here
        return null;
    }

    public String sort() {
        // TODO implement here
        return "";
    }

    public int start() {
        // TODO implement here
        return 0;
    }

    public int limit() {
        // TODO implement here
        return 0;
    }

	public OperationType getOperation() {
		return operation;
	}

	public void setOperation(OperationType operation) {
		this.operation = operation;
	}

	public PropertyType getPropType() {
		return propType;
	}

	public void setPropType(PropertyType propType) {
		this.propType = propType;
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

	public double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

}