import React, { useState } from "react";

export const Login = (pros) => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  function handleEmailChange(event) {
    setEmail(event.target.value);
    console.log("hiiii email changed");
  }

  function handlePasswordChange(event) {
    setPassword(event.target.value);
  }

  function handleSubmit(event) {
    event.preventDefault();
    console.log("Email:", email);
    console.log("Password:", password);
  }

  return (
    <div className="auth-form-container">
      <h2>Login</h2>
      <form className="login-form" onSubmit={handleSubmit}>
        <label for="email">Email:</label>
        <input
          type="email"
          value={email}
          onChange={handleEmailChange}
          id="email"
          name="email"
        />

        <label for="password">Password:</label>
        <input
          type="password"
          value={password}
          onChange={handlePasswordChange}
          id="password"
          name="password"
        />

        <button type="submit">Log in</button>
      </form>
      <button
        className="link-btn"
        onClick={() => pros.onFormSwitch("register")}
      >
        Don't have an account? Register
      </button>
    </div>
  );
};
