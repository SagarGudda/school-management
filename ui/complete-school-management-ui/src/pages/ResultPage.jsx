import { useEffect, useState } from "react";
import axios from "axios";

function ResultPage() {
  const [results, setResults] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8083/api/results")
      .then(res => setResults(res.data))
      .catch(err => console.error(err));
  }, []);

  return (
    <div className="space-y-4">
      <h1 className="text-2xl font-bold">Results</h1>
      <ul className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
        {results.map(result => (
          <li key={result.id} className="bg-white p-4 rounded shadow">
            <p className="font-semibold">Student: {result.studentName}</p>
            <p>Marks: {result.marks}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ResultPage;