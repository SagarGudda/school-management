import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav className="bg-white shadow p-4 flex justify-between">
      <h1 className="font-bold text-xl">School Dashboard</h1>
      <div className="space-x-4">
        <Link to="/" className="hover:underline">Home</Link>
        <Link to="/teachers" className="hover:underline">Teachers</Link>
        <Link to="/students" className="hover:underline">Students</Link>
        <Link to="/results" className="hover:underline">Results</Link>
      </div>
    </nav>
  );
}

export default Navbar;