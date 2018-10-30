package main;

import java.util.List;

public interface PropertySelectionFunction {
	public String selectProperty(List<String> properties, List<PerfilDeCredito> data);
}