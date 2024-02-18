package com.knu.buga1chuk.serialization.binary;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;
import com.knu.buga1chuk.model.PersonList;
import com.knu.buga1chuk.serialization.service.BinaryPersonSerializationService;
import com.knu.buga1chuk.service.PersonService;

import java.io.File;
import java.util.List;

public class WritePersonBinaryDemo {
    public static final BinaryPersonSerializationService binaryPersonSerializationService = BinaryPersonSerializationService.getInstance();
    public static final PersonService personService = PersonService.getInstance();

    public static void main(String[] args) {
        File file = new File(FilePathConstants.PEOPLE_DATA_BINARY_PATH);

        List<Person> persons = personService.getAllPersons(2);
        PersonList personList = new PersonList(persons);

        binaryPersonSerializationService.writePersonList(file, personList);
    }
}

