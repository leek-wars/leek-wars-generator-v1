package test;

import leekscript.runner.AI;
import leekscript.runner.LeekRunException;

public class DefaultUserAI extends AI {

	public DefaultUserAI() throws Exception {
		super(0, 11);
	}

	@Override
	public Object runIA() throws LeekRunException {
		return null;
	}

	@Override
	protected String[] getErrorString() {
		// TODO Auto-generated method stub
		return null;
	}
}
