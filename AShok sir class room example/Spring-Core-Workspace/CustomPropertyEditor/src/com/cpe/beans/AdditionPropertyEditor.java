package com.cpe.beans;

import java.beans.PropertyEditorSupport;

public class AdditionPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		if (text != null) {
			String[] values = text.split(",");
			int a = Integer.parseInt(values[0]);
			int b = Integer.parseInt(values[1]);
			setValue(new Addition(a, b));
		}
	}

}
