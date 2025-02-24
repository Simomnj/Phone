package com.zpx.phone.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.List;

public class TestUtil {
    public static void main(String[] args) throws JsonProcessingException {
        PathReader pathReader = new PathReader();
        List<String> fileData = pathReader.pathToFileName(null);
        ReadFileUtil readFileUtil = new ReadFileUtil();
        String s = readFileUtil.getFilePath(fileData.get(0));
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(s);
        JsonNode picName = jsonNode.path("body")
                                    .path("request")
                                    .path("noticeSetOfPicture");
        ((ObjectNode) picName).put("pictureName", "Mike");
        System.out.println(objectMapper.writeValueAsString(jsonNode));
    }
}
