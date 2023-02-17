package com.college.liberaryCard.Services;

import com.college.liberaryCard.Enums.CardStatus;
import com.college.liberaryCard.Models.Card;
import com.college.liberaryCard.Models.Student;
import com.college.liberaryCard.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String createStudent(Student student){

        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        // this will create adding data of foriegn key
        card.setStudent(student);

        // only card attribute that is in student class not set
        student.setCard(card);
        // here we are using bidirectional mapping it will automatically saved
        studentRepository.save(student);
        // by cascading it will automatically
        return "added sucessful";
    }
}
