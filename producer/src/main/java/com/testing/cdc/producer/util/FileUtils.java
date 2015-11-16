package com.testing.cdc.producer.util;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ted on 11/16/15.
 */
public class FileUtils {
    private static Stream<String> getStreamFromFile(URI filePath) throws IOException {
        return Files.lines(Paths.get(filePath));
    }

    private static String getInputFromFile(Stream<String> stream) {
        return (String)stream.collect(Collectors.joining());
    }

    public static String getInputFromFile(URI filePath) throws IOException {
        return getInputFromFile(getStreamFromFile(filePath));
    }
}
