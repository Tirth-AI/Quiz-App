package com.tirth.myquiz

object Constants {

    const val USER_NAME: String = "user_name"
    const val CORRECT_ANSWER: String = "correct_answer"
    const val TOTAL_QUESTIONS: String = "total_questions"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val ques1 = Question(
            1,
            "Which country does this flag belong to?",
            R.drawable.argentina,
            "Armenia", "Argentina", "Australia", "India",
            correctAnswer = 2
        )
        questionList.add(ques1)

        val ques2 = Question(
            1,
            "Which country does this flag belong to?",
            R.drawable.armenia,
            "Armenia", "Argentina", "Sri Lanka", "India",
            correctAnswer = 1
        )
        questionList.add(ques2)

        val ques3 = Question(
            1,
            "Which country does this flag belong to?",
            R.drawable.australia,
            "USA", "Europe", "Australia", "United Kingdom",
            correctAnswer = 3
        )
        questionList.add(ques3)

        val ques4 = Question(
            1,
            "Which country does this flag belong to?",
            R.drawable.india,
            "South Africa", "Kuwait", "Australia", "India",
            correctAnswer = 4
        )
        questionList.add(ques4)

        val ques5 = Question(
            1,
            "Which country does this flag belong to?",
            R.drawable.kuwait,
            "Cuba", "France", "Kuwait", "India",
            correctAnswer = 3
        )
        questionList.add(ques5)

        val ques6 = Question(
            1,
            "Which country does this flag belong to?",
            R.drawable.southkorea,
            "South Korea", "North Korea", "Indonesia", "Japan",
            correctAnswer = 1
        )
        questionList.add(ques6)

        val ques7 = Question(
            1,
            "Which country does this flag belong to?",
            R.drawable.srilanka,
            "India", "Kuwait", "Sri Lanka", "China",
            correctAnswer = 3
        )
        questionList.add(ques7)

        return questionList
    }
}