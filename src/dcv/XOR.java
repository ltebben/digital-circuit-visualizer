package dcv;

// Two input XOR gate - active when one but not both of its inputs is active
public class XOR extends Gate {

	public XOR(Gate top, Gate bottom) {
		super(top, bottom);
	}

	@Override
	boolean isActive() {
		return (topChild.isActive() != bottomChild.isActive());
	}

}