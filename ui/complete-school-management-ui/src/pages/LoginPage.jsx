import { useState } from "react";
import { useNavigate } from "react-router-dom";

function LoginPage() {
  const [mobile, setMobile] = useState("");
  const [otp, setOtp] = useState("");
  const [otpSent, setOtpSent] = useState(false);
  const [error, setError] = useState("");
  const navigate = useNavigate();

  const dummyOtp = "123456"; // hardcoded for demo

  const handleSendOtp = () => {
    if (mobile.length === 10) {
      setOtpSent(true);
      setError("");
      alert("Dummy OTP sent: 123456"); // or show toast
    } else {
      setError("Enter valid 10-digit mobile number");
    }
  };

  const handleVerifyOtp = () => {
    if (otp === dummyOtp) {
      localStorage.setItem("isLoggedIn", "true");
      navigate("/dashboard");
    } else {
      setError("Invalid OTP");
    }
  };

  return (
    <div className="flex flex-col items-center justify-center min-h-screen bg-gray-100">
      <div className="bg-white p-6 rounded shadow w-80 space-y-4">
        <h2 className="text-xl font-bold text-center">Mobile OTP Login</h2>
        {error && <p className="text-red-500 text-sm">{error}</p>}

        <input
          type="text"
          placeholder="Mobile Number"
          value={mobile}
          onChange={(e) => setMobile(e.target.value)}
          className="w-full p-2 border rounded"
        />

        {!otpSent ? (
          <button
            onClick={handleSendOtp}
            className="w-full bg-blue-600 text-white py-2 rounded"
          >
            Send OTP
          </button>
        ) : (
          <>
            <input
              type="text"
              placeholder="Enter OTP"
              value={otp}
              onChange={(e) => setOtp(e.target.value)}
              className="w-full p-2 border rounded"
            />
            <button
              onClick={handleVerifyOtp}
              className="w-full bg-green-600 text-white py-2 rounded"
            >
              Verify OTP
            </button>
          </>
        )}
      </div>
    </div>
  );
}

export default LoginPage;
