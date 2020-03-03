package com.mockitoguy;

import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

class DummyCli implements Cli {

    private final LinkedList<String> inputs;
    private final List<String> outputs = new LinkedList<>();

    private DummyCli(String ... input) {
        inputs = new LinkedList<>(asList(input));
    }

    static DummyCli withInput(String ... input) {
        return new DummyCli(input);
    }

    public void println(String text) {
        outputs.add(text);
    }

    public String readLine() {
        return inputs.pop();
    }

    public List<String> getOutputs() {
        return outputs;
    }
}
