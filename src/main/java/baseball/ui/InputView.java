package baseball.ui;

import baseball.global.Validator;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.*;

public class InputView {
	private final OutputView outputView;

	private static final String SEPARATOR = "";

	public InputView(OutputView outputView) {
		this.outputView = outputView;
	}

	public List<Integer> readPlayerNumbers() {
		outputView.printInputNumber();
		String[] input = readNumber();

		return Arrays.stream(input)
				.map(Integer::parseInt)
				.toList();
	}

	private String[] readNumber() {
		String[] inputNumbers = readLine().split(SEPARATOR);

		return inputNumbers;
	}

	public String readRestart() {
		outputView.printGameRestart();
		String option = readLine();

		Validator.validateRestart(option);
		return option;
	}
}