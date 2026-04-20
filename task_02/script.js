const students = [
    { name: "Alice Smith", email: "alice@example.com", dob: "2004-02-10", department: "CSE" },
    { name: "Bob Jones", email: "bob@example.com", dob: "2003-11-20", department: "ECE" },
    { name: "Charlie Brown", email: "charlie@example.com", dob: "2004-08-05", department: "CSE" },
    { name: "Diana Prince", email: "diana@example.com", dob: "2005-01-15", department: "MECH" }
];

function renderTable(data) {
    const tableBody = document.getElementById('tableBody');
    tableBody.innerHTML = '';
    data.forEach(s => {
        tableBody.innerHTML += `<tr>
            <td>${s.name}</td>
            <td>${s.email}</td>
            <td>${s.dob}</td>
            <td>${s.department}</td>
        </tr>`;
    });
    updateStats(data);
}

function updateStats(data) {
    const counts = data.reduce((acc, s) => {
        acc[s.department] = (acc[s.department] || 0) + 1;
        return acc;
    }, {});
    
    let statsHtml = '<strong>Students per Department:</strong><ul>';
    for (const [dept, count] of Object.entries(counts)) {
        statsHtml += `<li>${dept}: ${count}</li>`;
    }
    statsHtml += '</ul>';
    document.getElementById('statsArea').innerHTML = statsHtml;
}

function sortData(key) {
    const sorted = [...students].sort((a, b) => a[key] > b[key] ? 1 : -1);
    renderTable(sorted);
}

document.getElementById('filterDept').addEventListener('change', (e) => {
    const dept = e.target.value;
    const filtered = dept === 'All' ? students : students.filter(s => s.department === dept);
    renderTable(filtered);
});

// Initial Render
renderTable(students);
