package com.exo1.exo1.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "project_task")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectTask {
    @Id
    @Column(name = "projet_id")
    private Long projetId;

    @Column(name = "projet_name")
    private String projetName;

    @Column(name = "task_count")
    private Long taskCount;
}
