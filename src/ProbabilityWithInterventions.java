public class ProbabilityWithInterventions {

    GraphLayout graphLayout;
    ControlLayout controlLayout;
    OrdinaryDifferentialEquations ode;

    private double[] allInterventions;

    private double socialDistancingPercent;
    private double handWashingPercent;
    private double maskPercent;
    private double glovePercent;
//    private double N95Pct;

    private double SOCIALDISTANCING_EFFECTIVENESS = 0.81;
    private double HANDWASHING_EFFECTIVENESS = 0.55;
    private double MASK_EFFECTIVENESS = 0.68;
    private double GLOVE_EFFECTIVENESS = 0.57;
//    private double N95_MASK_EFFECTIVENESS = 0.91;

    private double probabilityOfInfection;

    public ProbabilityWithInterventions(double probabilityOfInfection, double[] interventions) {
        this.probabilityOfInfection = probabilityOfInfection;

        graphLayout = new GraphLayout();
        controlLayout = new ControlLayout(graphLayout);

        this.allInterventions = interventions;
        socialDistancingPercent = allInterventions[0]/100;
        handWashingPercent = allInterventions[1]/100;
        maskPercent = allInterventions[2]/100;
        glovePercent = allInterventions[3]/100;

        System.out.println(socialDistancingPercent);
        System.out.println(handWashingPercent);
        System.out.println(maskPercent);
        System.out.println(glovePercent);

        System.out.println("+================");
    }

    public double calculate() {
        System.out.println("Probability before everything: " + probabilityOfInfection);
        probabilityOfInfection *= 1 - (SOCIALDISTANCING_EFFECTIVENESS * socialDistancingPercent);
        System.out.println("Probability After SD: " + probabilityOfInfection);
        probabilityOfInfection *= 1 - (HANDWASHING_EFFECTIVENESS * handWashingPercent);
        System.out.println("Probability After HW: " + probabilityOfInfection);
        probabilityOfInfection *= 1 - (MASK_EFFECTIVENESS * maskPercent);
        System.out.println("Probability After MW: " + probabilityOfInfection);
        probabilityOfInfection *= 1 - (GLOVE_EFFECTIVENESS * glovePercent);
        System.out.println("Probability After GlW: " + probabilityOfInfection);

        System.out.println("============================================");

        return probabilityOfInfection;
    }
}
