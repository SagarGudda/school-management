import { useEffect, useState } from "react";
import axios from "axios";

function TeacherPage() {
  const [teachers, setTeachers] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8081/api/teachers")
      .then(res => setTeachers(res.data))
      .catch(err => console.error(err));
  }, []);

  return (
    <div className="space-y-4">
      <h1 className="text-2xl font-bold">Teachers</h1>
      <ul className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
        {teachers.map(teacher => (
          <li key={teacher.id} className="bg-white p-4 rounded shadow">
            <p className="font-semibold">{teacher.name}</p>
            <p>{teacher.subject}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TeacherPage;