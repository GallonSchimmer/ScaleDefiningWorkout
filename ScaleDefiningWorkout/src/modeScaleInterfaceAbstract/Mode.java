package modeScaleInterfaceAbstract;

public class Mode extends ModeAbstract implements DefineScaleInterface {

	public Mode() {

	}

	@Override
	public String getIonian() {
		System.out.println("getIonian gets the: " + Ionian);
		return this.Ionian;

	}

	@Override
	public String getLydian() {
		System.out.println("getLydian gets the: " + Lydian);
		return this.Lydian;

	}

	@Override
	public String getMixolydian() {
		System.out.println("getMixolydian gets the: " + Mixolydian);
		return this.Mixolydian;

	}

	@Override
	public String getDorian() {
		System.out.println("getDorian gets the: " + Dorian);
		return this.Dorian;

	}

	@Override
	public String getAeolian() {
		System.out.println("getAeolian gets the: " + Aeolian);
		return this.Aeolian;

	}

	@Override
	public String getPhrygian() {
		System.out.println("getIonian gets the: " + Phrygian);
		return this.Phrygian;

	}

	@Override
	public String getLocrian() {
		System.out.println("getPhrygian gets the: " + Locrian);
		return this.Locrian;

	}
}
