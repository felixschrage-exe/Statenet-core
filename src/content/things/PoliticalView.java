package content.things;

public class PoliticalView {

	public float economic;
	public float societal;
	public float authority;
	public float environment;
	public float foreignPolicy;

	public PoliticalView(float economic, float societal, float authority, float environment, float foreignPolicy) {
		this.economic = economic;
		this.societal = societal;
		this.authority = authority;
		this.environment = environment;
		this.foreignPolicy = foreignPolicy;
	}

	public PoliticalView() {
		this.economic = 0.0f;
		this.societal = 0.0f;
		this.authority = 0.0f;
		this.environment = 0.0f;
		this.foreignPolicy = 0.0f;			
	}
	
	public float distanceTo(PoliticalView otherPoliticalView) {
        float sum = 0.0f;
        sum += Math.pow(this.economic - otherPoliticalView.economic, 2);
        sum += Math.pow(this.societal - otherPoliticalView.societal, 2);
        sum += Math.pow(this.authority - otherPoliticalView.authority, 2);
        sum += Math.pow(this.environment - otherPoliticalView.environment, 2);
        sum += Math.pow(this.foreignPolicy - otherPoliticalView.foreignPolicy, 2);
        return (float) Math.sqrt(sum);
    }
    
}
