package training.boiko.train.depot;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import training.boiko.train.bean.Train;

public class TrainDepot {
	private ArrayList<Train> trainDepot;

	public TrainDepot() {
		trainDepot = new ArrayList<Train>();

	}

	public ArrayList<Train> getTrainDepot() {
		return trainDepot;
	}

	public void setTrainDepot(ArrayList<Train> trainDepot) {
		this.trainDepot = trainDepot;
	}

	public void addTrain(Train train) {
		trainDepot.add(train);
	}

	public ArrayList<Train> findByTrainNumber() {
		System.out.println("Input TrainNumber (228 or 229):");
		Scanner sc = new Scanner(System.in);
		int trainNumber = sc.nextInt();
		while (trainNumber != 228 && trainNumber != 229) {
			System.out.println("Wrong TrainNumber");
			System.out.println("Input another TrainNumber (228 or 229):");
			trainNumber = sc.nextInt();
		}
		ArrayList<Train> result = new ArrayList<Train>();
		for (Train s : trainDepot) {
			if (s.getTrainNumber() == trainNumber) {
				result.add(s);
			}
		}
		result.sort(Comparator.comparing(Train::getDepartureTime));
		return result;
	}

	public ArrayList<Train> sortByDestination(String destination) {
		System.out.println("\nSelected destination: " + destination + "\nAvailable trains: ");
		ArrayList<Train> result = new ArrayList<Train>();
		for (Train s : trainDepot) {
			if (destination.equalsIgnoreCase(s.getDestination())) {
			result.add(s);
			}
		}
		result.sort(Comparator.comparing(Train::getDepartureTime));
		return result;
	}

}
