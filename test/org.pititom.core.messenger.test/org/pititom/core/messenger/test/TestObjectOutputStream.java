package org.pititom.core.messenger.test;

import java.io.IOException;
import java.io.OutputStream;

import org.pititom.core.stream.ObjectOutputStream;

/**
*
* @author Thomas Pérennou
*/
public class TestObjectOutputStream extends ObjectOutputStream {

	public TestObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}

	@Override
	protected void writeClass(Class<?> clazz) throws IOException {
		this.writeInt(clazz.getName().length());
		this.write(clazz.getName().getBytes());
	}
}
