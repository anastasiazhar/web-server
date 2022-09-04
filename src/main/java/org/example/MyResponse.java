package org.example;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

public record MyResponse(StatusLine statusLine, HashMap<String, String> responseHeaders, ByteArrayOutputStream responseBody) {
}
