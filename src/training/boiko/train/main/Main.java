package training.boiko.train.main;

import training.boiko.train.bean.Train;
import training.boiko.train.depot.TrainDepot;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TrainDepot trainDepot = new TrainDepot();
		Train tr18 = new Train("Minsk", 229, LocalTime.of(00, 10));
		Train tr17 = new Train("Minsk", 229, LocalTime.of(00, 15));
		Train tr16 = new Train("Minsk", 229, LocalTime.of(00, 17));
		Train tr15 = new Train("Minsk", 229, LocalTime.of(00, 22));
		Train tr14 = new Train("Brest", 228, LocalTime.of(00, 11));
		Train tr13 = new Train("Brest", 228, LocalTime.of(00, 05));
		Train tr12 = new Train("Brest", 228, LocalTime.of(00, 12));
		Train tr11 = new Train("Brest", 228, LocalTime.of(00, 14));

		trainDepot.addTrain(tr18);
		trainDepot.addTrain(tr17);
		trainDepot.addTrain(tr16);
		trainDepot.addTrain(tr15);
		trainDepot.addTrain(tr14);
		trainDepot.addTrain(tr13);
		trainDepot.addTrain(tr12);
		trainDepot.addTrain(tr11);


		
		ArrayList<Train> trainDepotForConsole = trainDepot.findByTrainNumber();
		for (Train s : trainDepotForConsole) {
			System.out.println(s);

		}
		ArrayList<Train> sortedTrainDepotForConsole = trainDepot.sortByDestination("Brest");
		
		for (Train t : sortedTrainDepotForConsole) {
			System.out.println(t);
		}
	}
}
