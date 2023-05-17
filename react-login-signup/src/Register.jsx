import React, { useState } from "react";

export const Register = (pros) => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [name, setName] = useState("");

  function handleEmailChange(event) {
    setEmail(event.target.value);
    console.log("hiiii email changed");
  }

  function handlePasswordChange(event) {
    setPassword(event.target.value);
  }

  function handleSubmit(event) {
    event.preventDefault();

    // send email and password to server for validation
    // ...

    console.log("Email:", email);
    console.log("Password:", password);
  }

  return (
    <div className="auth-form-container">
      <form className="register-form" onSubmit={handleSubmit}>
        <h2>Register</h2>
        <label htmlFor="name">Full name</label>
        <input
          value={name}
          name="name"
          onChange={(e) => setName(e.target.value)}
          id="name"
          placeholder="full Name"
        />

        <label htmlfor="email">Email:</label>
        <input
          type="email"
          value={email}
          onChange={handleEmailChange}
          id="email"
          name="email"
          placeholder="EMAIL"
        />

        <label for="password">Password:</label>
        <input
          type="password"
          value={password}
          onChange={handlePasswordChange}
          id="password"
          name="password"
          placeholder="********"
        />

        <button type="submit">Register</button>
      </form>
      <button className="link-btn" onClick={() => pros.onFormSwitch("login")}>
        Already have an account? login
      </button>
    </div>
  );
};
