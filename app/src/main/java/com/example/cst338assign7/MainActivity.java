package com.example.cst338assign7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etCourse;
    Button btnSearch;
    TextView tvCourseTitle, tvCourseDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCourse = findViewById(R.id.etCourse);
        btnSearch = findViewById(R.id.btnSearch);
        tvCourseTitle = findViewById(R.id.tvCourseTitle);
        tvCourseDescription = findViewById(R.id.tvCourseDescription);

        tvCourseTitle.setVisibility(View.GONE);
        tvCourseDescription.setVisibility(View.GONE);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // check if the user entered a numeric value
                String text = etCourse.getText().toString();
                boolean digits_only = TextUtils.isDigitsOnly(text);

                String course_description, course_title;

                // if there are only digits in the text entered by the user,
                // first check for empty strings, then check for a matching course title and description
                if (digits_only)
                {
                    if (text.length() == 0)
                    {
                        Toast.makeText(getApplicationContext(), "Field cannot be empty.",
                                Toast.LENGTH_LONG).show();
                        course_title = "No course matches your search";
                        course_description = "Field cannot be empty.";
                    }
                    else
                    {
                        int course_number = Integer.parseInt(etCourse.getText().toString().trim());

                        switch(course_number)
                        {
                            case 237:
                                course_title = "CST 237 - Intro to Computer Architecture";
                                course_description = "This course introduces computer architectures " +
                                        "and computer systems management. Includes data representation, " +
                                        "memory, registers, and internals of common computers and system " +
                                        "interfaces. Knowledge of C/C++ programming helpful but not mandatory.";
                                break;
                            case 170:
                                course_title = "MATH 170 - Discrete Mathematics";
                                course_description = "Includes sets and sequences, elementary logic, " +
                                        "relations, induction, counting principles, discrete probability, " +
                                        "Boolean algebra, logic networks, matrices, graph theory, " +
                                        "and trees. Applies these topics to real life and branches " +
                                        "of science, particularly computer science.";
                                break;
                            case 150:
                                course_title = "MATH 150 - Calculus I";
                                course_description = "Includes limits, continuity, derivatives " +
                                        "including trigonometric functions, chain rule, curve sketching, " +
                                        "extremum problems, implicit differentiation, related rates, " +
                                        "Mean Value Theorem, logarithmic and trigonometric functions, " +
                                        "introduction to integration, fundamental theorem of calculus, " +
                                        "substitution, and applications.";
                                break;
                            case 151:
                                course_title = "MATH 151 - Calculus II";
                                course_description = "Includes the calculus of exponential and " +
                                        "logarithmic functions, trigonometric and inverse trigonometric " +
                                        "functions, techniques of integration, separable differential " +
                                        "equations, Taylor polynomials, L’Hôpital’s rule, improper " +
                                        "integrals, series, and introduction to partial derivatives.";
                                break;
                            case 270:
                                course_title = "MATH 270 - Mathematics for Computing";
                                course_description = "This course covers basic linear algebra, " +
                                        "continuous and discrete probability, and a continuation " +
                                        "of elementary discrete mathematics from MATH 170. It emphasizes " +
                                        "mathematical theory as well as applicable methods. Topics " +
                                        "include systems of linear equations, matrices, determinants, " +
                                        "vector spaces, conditional probability, distributions and " +
                                        "densities, expected value, functions of random variables, " +
                                        "automata, and algorithmic complexity.";
                                break;
                            case 300:
                                course_title = "CST 300 - Major ProSeminar";
                                course_description = "Helps students identify and articulate personal, " +
                                        "professional, and social goals. Provides an integrated overview " +
                                        "of the computer science and communication design majors and " +
                                        "their requirements. Students develop a plan for their learning " +
                                        "goals. Students learn writing, presentation, research and " +
                                        "critical-thinking skills within the diversified fields of " +
                                        "information technology and communication design. Students " +
                                        "learn how to analyze, predict, and articulate trends in the " +
                                        "academic, public service,";
                                break;
                            case 338:
                                course_title = "CST 338 - Software Design";
                                course_description = "Provides students with the fundamental concepts " +
                                        "to develop large-scale software, focusing on the object-oriented " +
                                        "programming techniques. Coverage includes the introduction to " +
                                        "Java programming language, object-oriented programming, " +
                                        "software life cycle and development processes, requirements " +
                                        "analysis, and graphical user interface development.";
                                break;
                            case 311:
                                course_title = "CST 311 - Intro to Computer Networks";
                                course_description = "Survey of Telecomm and Data Comm Technology " +
                                        "Fundamentals, Local Area Network, Wide Area Network, Internet " +
                                        "and internetworking protocols including TCP/IP, network security " +
                                        "and performance, emerging industry trends such as voice over " +
                                        "the network and high speed networking. Designed as a foundation " +
                                        "for students who wish to pursue more advanced network studies " +
                                        "including certificate programs. Includes hands-on networking " +
                                        "labs that incorporate Cisco CCNA lab components.";
                                break;
                            case 334:
                                course_title = "CST 334 - Operating Systems";
                                course_description = "Students in this course will learn about the " +
                                        "use and design of modern operating systems, focusing on Linux. " +
                                        "On the “use” side, students will learn the Linux command " +
                                        "line, to write shell scripts, and to build programs with GNU " +
                                        "utilities like awk, sed, and make. On the “design” side, " +
                                        "students will develop a deep understanding of process management, " +
                                        "memory management, file systems, and concurrency, and how they " +
                                        "apply to modern technologies like virtualization and cloud computing.";
                                break;
                            case 336:
                                course_title = "CST 336 - Internet Programming";
                                course_description = "Provides students with dynamic web application " +
                                        "development skills, focusing on the integration of server-side " +
                                        "programming, database connectivity, and client-side scripting. " +
                                        "Coverage includes the Internet architecture, responsive design, " +
                                        "RESTful web services, and Web APIs.";
                                break;
                            case 363:
                                course_title = "CST 363 - Introduction to Database Systems";
                                course_description = "This course provides balanced coverage of database " +
                                        "use and design,focusing on relational databases. Students will " +
                                        "learn to design relational schemas, write SQL queries, access " +
                                        "a DB programmatically,and perform database administration. " +
                                        "Students will gain a working knowledge of the algorithms and " +
                                        "data structures used in query evaluation and transaction " +
                                        "processing. Students will also learn to apply newer database " +
                                        "technologies such as XML, NoSQL, and Hadoop.";
                                break;
                            case 370:
                                course_title = "CST 370 - Design and Analysis of Algorithms";
                                course_description = "Students learn important data structures in " +
                                        "computer science and acquire fundamental algorithm design " +
                                        "techniques to get the efficient solutions to several computing " +
                                        "problems from various disciplines. Topics include the analysis " +
                                        "of algorithm efficiency, hash, heap, graph, tree, sorting and " +
                                        "searching, brute force, divide-and-conquer, decrease-and-conquer, " +
                                        "transform-and-conquer, dynamic programming, and greedy programming.";
                                break;
                            case 438:
                                course_title = "CST 438 - Software Engineering";
                                course_description = "Prepares students for large-scale software " +
                                        "development using software engineering principles and techniques. " +
                                        "Coverage includes software process, requirements analysis and " +
                                        "specification, software design, implementation, testing, and " +
                                        "project management. Students are expected to work in teams to " +
                                        "carry out a realistic software project.";
                                break;
                            case 462:
                                course_title = "CST 462 - Race, Gender, Class, in the Digital World";
                                course_description = "Provides students with key knowledge of race, " +
                                        "gender, class and social justice especially in relation to " +
                                        "technology in today’s digital world. Students challenge the " +
                                        "barriers of expertise, gender, race, class, and location that " +
                                        "restrict wider access to and understanding of the production " +
                                        "and usage of new technologies. Students will engage in a " +
                                        "practical experience in the community via their service " +
                                        "placements, which will provide depth and context for considering " +
                                        "questions of justice, equality, social responsibilities and the " +
                                        "complexities of technology and its societal impact. The course " +
                                        "uses scenario based approach combining presentations, discussions, " +
                                        "and reflections to allow students explore the relationship " +
                                        "between critical reflection and action on the topics " +
                                        "mentioned above.";
                                break;
                            case 499:
                                course_title = "CST 499 - Computer Science Capstone";
                                course_description = "Students will work on a project in large groups " +
                                        "(up to 5 students in each group), developing requirements " +
                                        "specification, a solution plan followed by design and " +
                                        "implementation of the solution. The problem statement for the " +
                                        "projects will be selected by the faculty. Faculty will also " +
                                        "play the role of a project manager directing the schedule and " +
                                        "deliverables for these projects.";
                                break;
                            case 383:
                                course_title = "CST 383 - Introduction to Data Science";
                                course_description = "In data science, data analysis and machine learning " +
                                        "techniques are applied to visualize data, understand trends, " +
                                        "and make predictions. In this course students will learn how " +
                                        "to obtain data, preprocess it, apply machine learning methods, " +
                                        "and visualize the results. A student who completes the course " +
                                        "will have enough theoretical knowledge, and enough skill with " +
                                        "modern statistical programming languages and their libraries, " +
                                        "to define and perform complete data science projects.";
                                break;
                            case 325:
                                course_title = "CST 325 - Graphics Programming";
                                course_description = "This course teaches the students the fundamentals " +
                                        "of game programming and skills needed for game development, " +
                                        "including GPU programming, matrix and quaternion algebra for " +
                                        "physics calculation, animation, lighting and basics of " +
                                        "implementing 3D models into a framework.";
                                break;
                            default:
                                Toast.makeText(getApplicationContext(), "This course number does not exist.",
                                        Toast.LENGTH_LONG).show();
                                course_title = "No course matches your search";
                                course_description = "This course number does not exist.";
                                break;
                        }
                        // end of switch
                    }

                    // display course title and description
                    tvCourseTitle.setText(course_title);
                    tvCourseDescription.setText(course_description);
                    tvCourseTitle.setVisibility(View.VISIBLE);
                    tvCourseDescription.setVisibility(View.VISIBLE);
                }
                // end of if (digits_only)
                // else, if text entered is not digits only
                else
                {
                    Toast.makeText(getApplicationContext(), "Please only enter numeric values.",
                            Toast.LENGTH_LONG).show();
                    course_title = "No course matches your search";
                    course_description = "Please only enter numeric values.";
                    tvCourseTitle.setText(course_title);
                    tvCourseDescription.setText(course_description);
                    tvCourseTitle.setVisibility(View.VISIBLE);
                    tvCourseDescription.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}