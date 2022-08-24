/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.dynNet.operationsImpl;
import src.dynNet.dynCalculator.Operation;


/**
 * Class [LogOperation]
 * <p>
 * This is a concrete operation class, that implements the
 * interface <code>Operation</code>.
 *
 * @author yoshita,gowtam,sharanya
 */
public class LogOperation implements Operation {
	public float calculate(float firstNumber, float secondNumber){
		return (float)(Math.log(firstNumber) / Math.log(secondNumber));

}
}