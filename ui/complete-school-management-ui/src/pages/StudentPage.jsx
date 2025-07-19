import { useEffect, useState } from "react";
import api from "../api"; // Axios instance with token interceptor

function StudentPage() {
  const [students, setStudents] = useState([]);
  const [form, setForm] = useState({
    name: "",
    studentClass: "",
    rollNumber: "",
    dob: "",
    birthCertificateNumber: "",
    emailId: "",
    password: "",
    rewritePassword: "",
    fatherName: "",
    fatherContactNo: "",
    fatherOccupation: "",
    motherName: "",
    motherContactNo: "",
    motherOccupation: ""
  });
  const [isEditing, setIsEditing] = useState(false);

  const fetchStudents = () => {
    api.get("/getAllStudentDetails")
      .then(res => setStudents(res.data))
      .catch(err => console.error("Fetch error:", err));
  };

  useEffect(() => {
    fetchStudents();
  }, []);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setForm(prev => ({ ...prev, [name]: value }));
  };

  const saveStudent = () => {
    api.post("/saveStudentDetails", form)
      .then(() => {
        resetForm();
        fetchStudents();
      })
      .catch(err => console.error("Save error:", err));
  };

  const editStudent = (rollNumber) => {
    api.get(`/getStudentDetailsById/${rollNumber}`)
      .then(res => {
        setForm(res.data);
        setIsEditing(true);
      })
      .catch(err => console.error("Edit error:", err));
  };

  const updateStudent = () => {
    api.put("/updateStudentDetails", form)
      .then(() => {
        resetForm();
        fetchStudents();
      })
      .catch(err => console.error("Update error:", err));
  };

  const resetForm = () => {
    setForm({
      name: "",
      studentClass: "",
      rollNumber: "",
      dob: "",
      birthCertificateNumber: "",
      emailId: "",
      password: "",
      rewritePassword: "",
      fatherName: "",
      fatherContactNo: "",
      fatherOccupation: "",
      motherName: "",
      motherContactNo: "",
      motherOccupation: ""
    });
    setIsEditing(false);
  };

  return (
    <div className="space-y-4">
      <h1 className="text-2xl font-bold">Student Management (by Roll Number)</h1>

      {/* Form */}
      <div className="bg-white p-4 rounded shadow space-y-2 grid grid-cols-1 md:grid-cols-2 gap-4">
        <input name="rollNumber" placeholder="Roll Number" value={form.rollNumber} onChange={handleChange} className="border p-2 rounded" />
        <input name="name" placeholder="Name" value={form.name} onChange={handleChange} className="border p-2 rounded" />
        <input name="studentClass" placeholder="Class" value={form.studentClass} onChange={handleChange} className="border p-2 rounded" />
        <input name="dob" type="date" placeholder="Date of Birth" value={form.dob} onChange={handleChange} className="border p-2 rounded" />
        <input name="birthCertificateNumber" placeholder="Birth Certificate No" value={form.birthCertificateNumber || ""} onChange={handleChange} className="border p-2 rounded" />
        <input name="emailId" type="email" placeholder="Email" value={form.emailId} onChange={handleChange} className="border p-2 rounded" />
        <input name="password" type="password" placeholder="Password" value={form.password} onChange={handleChange} className="border p-2 rounded" />
        <input name="rewritePassword" type="password" placeholder="Rewrite Password" value={form.rewritePassword} onChange={handleChange} className="border p-2 rounded" />
        <input name="fatherName" placeholder="Father's Name" value={form.fatherName || ""} onChange={handleChange} className="border p-2 rounded" />
        <input name="fatherContactNo" placeholder="Father's Contact No" value={form.fatherContactNo || ""} onChange={handleChange} className="border p-2 rounded" />
        <input name="fatherOccupation" placeholder="Father's Occupation" value={form.fatherOccupation || ""} onChange={handleChange} className="border p-2 rounded" />
        <input name="motherName" placeholder="Mother's Name" value={form.motherName || ""} onChange={handleChange} className="border p-2 rounded" />
        <input name="motherContactNo" placeholder="Mother's Contact No" value={form.motherContactNo || ""} onChange={handleChange} className="border p-2 rounded" />
        <input name="motherOccupation" placeholder="Mother's Occupation" value={form.motherOccupation || ""} onChange={handleChange} className="border p-2 rounded" />

        <button
          onClick={isEditing ? updateStudent : saveStudent}
          className="col-span-full bg-blue-600 text-white px-4 py-2 rounded"
        >
          {isEditing ? "Update Student" : "Add Student"}
        </button>
      </div>

      {/* List */}
      <ul className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
        {students.map(student => (
          <li key={student.rollNumber} className="bg-white p-4 rounded shadow">
            <p><strong>{student.name}</strong></p>
            <p>Class: {student.studentClass}</p>
            <p>Roll: {student.rollNumber}</p>
            <p>DOB: {student.dob}</p>
            <button onClick={() => editStudent(student.rollNumber)} className="text-blue-600 underline mt-2">
              Edit
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default StudentPage;
