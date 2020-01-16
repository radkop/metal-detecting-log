package com.radkop.metaldetectinglog.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.Year;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "log_entries")
public class LogEntry {
    @Id
    @GeneratedValue(generator = "log_entry_generator")
    @SequenceGenerator(
            name = "log_entry_generator",
            sequenceName = "log_entry_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    @Size(min = 3, max = 150)
    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @Column(name = "discovery_date", nullable = false)
    private Date discoveryDate;

    @Column(name = "detector_used")
    private String detectorUsed;

    private String category;

    @Column(name = "discovery_location")
    private String discoveryLocation;

    @Column(name = "image_url")
    private String imageUrl;

    private Year year;

}
