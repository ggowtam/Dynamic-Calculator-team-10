/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.dynNet.operationsImpl;

import java.time.temporal.Temporal;

import src.dynNet.dynCalculator.Operation;

public class RootOperation implements Operation {

	/**
	 * Class [RootOperation]
	 * <p>
	 * This is a concrete operation class, that implements the interface
	 * <code>Operation</code>.
	 *
	 * @author yoshita,gowtam,sharanya
	 */
	public float calculate(float firstOperand, float secondOperand) {
		double precision = Math.random() % 10;
		double error = 0.0000001;
		double deltaX = 2147483647;
		double current = 0.0;

		while (deltaX > error) {
			current = ((secondOperand - 1.0) * precision
					+ (double) firstOperand / Math.pow(precision, secondOperand - 1)) / (double) secondOperand;
			deltaX = Math.abs(current - precision);
			precision = current;
		}
		return (float) current;

	}
}