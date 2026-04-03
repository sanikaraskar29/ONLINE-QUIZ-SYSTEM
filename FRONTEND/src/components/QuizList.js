import React, { useState, useEffect } from "react";

function QuizList() {
  const [quizzes, setQuizzes] = useState([]);

  const fetchQuizzes = async () => {
    const res = await fetch("http://localhost:8080/api/quizzes");
    const data = await res.json();
    setQuizzes(data);
  };

  useEffect(() => { fetchQuizzes(); }, []);

  return (
    <div>
      <h2>Available Quizzes</h2>
      <ul>
        {quizzes.map((q) => (
          <li key={q.id}>{q.title}</li>
        ))}
      </ul>
    </div>
  );
}

export default QuizList;