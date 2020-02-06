package org.example;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class firstPlugin implements Plugin<Project> {
	public void apply(Project project) {
		project.getTasks().create(
			"englishTask",
			sampleTask.class,
			(task) -> {
				task.setMessage("Hello");
				task.setRecipient("World");
			});

		project.getTasks().create(
			"hindiTask",
			sampleTask.class,
			(task) -> {
				task.setMessage("namaste");
				task.setRecipient("duniya");
			});
	}
}
