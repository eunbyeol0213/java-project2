package com.example.javaproject2.week4.day4;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ReadFileEx {
    LineReader lineReader;
    Charset charset;

    public  ReadFileEx(Charset charset){
        this.charset = charset;
    }
    public List<String> getLines(String fileName) {
        List<String> lines = new LinkedList<>();

        //BufferedReader 선언 -> File 연결
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)) {

            //BufferedReader에서 loop으로 한줄씩 불러오기
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return lines;
    }

    public Hospital parse(String str){
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospital(List<String> lines){
        //파일에서 읽어온 정보를 담을 ArrayList 생성
        List<Hospital> hospitals = new ArrayList<>();
        //lines 배열의 길이만큼 line을 반복
        for(String line : lines){
            //리스트 hospitals에 parse() 메서드에서 리턴 된 값을 삽입함
            hospitals.add(parse(line));
        }
        return hospitals;
    }
        public static void main(String[] args) throws IOException{
        //ReadFileEx 클래스 인스턴스화
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        //getLines() 메소드에서 읽어온 파일을 String 타입의 list 인 strLines에 담아준다
        List<String> strLines = rfe.getLines("hospital_info_10lines.csv");
        //getHospital() 메소드에서 읽어온 병원 정보를 Hospital 타입의 list인 parsedHospitals에 담아준다
        List<Hospital> parsedHospitals = rfe.getHospital(strLines);
        //parsedHospitals 배열의 길이만큼 반복
        for (int i = 0; i < parsedHospitals.size(); i++) {
            //parsedHospitals 배열에서 인덱스 i 위치에 있는 값을 출력해서 hospital에 담아준다
            Hospital hospital = parsedHospitals.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(), hospital.getAddress().getFullAddr());
        }
    }
}
