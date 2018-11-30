package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.TaskRepository;
import domain.Task;

@Service
@Transactional
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Collection<Task> findAll() {
		Collection<Task> result;

		result = taskRepository.findAll();
		Assert.notNull(result);

		return result;
	}
	
	public Task findOne(int applicationId) {
		Assert.isTrue(applicationId != 0);

		Task result;

		result = taskRepository.findOne(applicationId);
		Assert.notNull(result);

		return result;
	}

}
