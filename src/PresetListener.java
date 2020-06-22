import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PresetListener implements ActionListener {
    JComboBox comboBox;
    JLabel label;
    String s;
    ControlLayout controlLayout;

    public PresetListener(JComboBox comboBox, JLabel label, ControlLayout controlLayout) {
        this.comboBox = comboBox;
        this.label = label;
        this.controlLayout = controlLayout;
        s = (String) comboBox.getSelectedItem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        s = (String) comboBox.getSelectedItem();
        controlLayout.chosenPresets.setText(s);

        switch (s) {
            case "Default":
                setSliderAndLabelValue(controlLayout.populationSlider,
                        controlLayout.chosenPopulation, 1000, " People");
                setSliderAndLabelValue(controlLayout.durationSlider,
                        controlLayout.chosenDuration, 10, " Days");
                setSliderAndLabelValue(controlLayout.transmissionRiskSlider,
                        controlLayout.chosenTransmissionRisk, 20, "%");
                comboBox.setSelectedItem(s);
                label.setText(s);
            case "COVID-19":
                setSliderAndLabelValue(controlLayout.populationSlider,
                        controlLayout.chosenPopulation, 1000, " People");
                setSliderAndLabelValue(controlLayout.durationSlider,
                        controlLayout.chosenDuration, 10, " Days");
                setSliderAndLabelValue(controlLayout.transmissionRiskSlider,
                        controlLayout.chosenTransmissionRisk, 20, "%");
                comboBox.setSelectedItem(s);
                label.setText(s);
            case "SARS":
                setSliderAndLabelValue(controlLayout.populationSlider,
                        controlLayout.chosenPopulation, 1000, " People");
                setSliderAndLabelValue(controlLayout.durationSlider,
                        controlLayout.chosenDuration, 10, " Days");
                setSliderAndLabelValue(controlLayout.transmissionRiskSlider,
                        controlLayout.chosenTransmissionRisk, 20, "%");
                comboBox.setSelectedItem(s);
                label.setText(s);
            case "H1N1":
                setSliderAndLabelValue(controlLayout.populationSlider,
                        controlLayout.chosenPopulation, 1000, " People");
                setSliderAndLabelValue(controlLayout.durationSlider,
                        controlLayout.chosenDuration, 10, " Days");
                setSliderAndLabelValue(controlLayout.transmissionRiskSlider,
                        controlLayout.chosenTransmissionRisk, 20, "%");
                comboBox.setSelectedItem(s);
                label.setText(s);
            default:
                break;
        }
    }

    public void setSliderAndLabelValue(JSlider slider, JLabel label, int sliderValue, String suffix) {
        slider.setValue(sliderValue);
        label.setText(sliderValue + suffix);
    }
}
