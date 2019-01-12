package clases;

import javax.swing.JOptionPane;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.Perceptron;

/**
 *
 * @author LLira
 */
public class PerceptronTest {
    public static void main(String[] args) {
        // create new perceptron network
        NeuralNetwork neuralNetwork = new Perceptron(2, 1);
        // create training set
        DataSet trainingSet
                = new DataSet(2, 1);
        // add training data to training set (logical OR function)
        trainingSet.addRow(new DataSetRow(new double[]{0, 0},
                new double[]{0}));
        trainingSet.addRow(new DataSetRow(new double[]{0, 1},
                new double[]{1}));
        trainingSet.addRow(new DataSetRow(new double[]{1, 0},
                new double[]{1}));
        trainingSet.addRow(new DataSetRow(new double[]{1, 1},
                new double[]{1}));
        // learn the training set
        neuralNetwork.learn(trainingSet);
        // save the trained network into file
        neuralNetwork.save("C:\\Users\\LLira\\Desktop\\NN_Perceptron.nnet");
        // load the saved network
        neuralNetwork = NeuralNetwork.createFromFile("C:\\Users\\LLira\\Desktop\\NN_Perceptron.nnet");
        // set network input
        int x1, x2;
        x1 = Integer.parseInt(JOptionPane.showInputDialog("x1?"));
        x2 = Integer.parseInt(JOptionPane.showInputDialog("x2?"));
        
        neuralNetwork.setInput(x1, x2);
        // calculate network
        neuralNetwork.calculate();
        // get network output
        double[] networkOutput = neuralNetwork.getOutput();
        for (int i = 0; i < networkOutput.length; i++) {
            //System.out.println("Salida ==> " + networkOutput[i]);
            JOptionPane.showMessageDialog(null, "Salida = " + networkOutput[i]);
        }
    }
} // End
