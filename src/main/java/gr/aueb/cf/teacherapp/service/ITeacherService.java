package gr.aueb.cf.teacherapp.service;

import gr.aueb.cf.teacherapp.core.exceptions.EntityAlreadyExistsException;
import gr.aueb.cf.teacherapp.core.exceptions.InvalidArgumentException;
import gr.aueb.cf.teacherapp.dto.TeacherInsertDTO;
import gr.aueb.cf.teacherapp.dto.TeacherReadOnlyDTO;
import gr.aueb.cf.teacherapp.model.Teacher;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;

public interface ITeacherService {

    @Transactional
    public Page<TeacherReadOnlyDTO> getPaginatedTeachers(int page, int size);
    Teacher saveTeacher(TeacherInsertDTO dto) throws EntityAlreadyExistsException, InvalidArgumentException;
}
