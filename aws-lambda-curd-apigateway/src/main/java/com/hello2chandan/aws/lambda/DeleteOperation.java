package com.hello2chandan.aws.lambda;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hello2chandan.aws.lambda.repo.StudentRepo;

@Component
public class DeleteOperation implements Function<Integer, Integer> {

	@Autowired
	private StudentRepo studentRepo;
	@Override
	public Integer apply(Integer id) {
		return studentRepo.delete(id);
	}
}
