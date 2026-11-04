// Ejercicio 1: Función que valide una contraseña (mínimo 8 caracteres, 1 número, 1 mayúscula)

function validatePassword(password) {
	if (password.length < 8) {
		return false;
	}
	if (!/\d/.test(password)) { // usamos test, que recibe una expresion regular y una cadena
		return false;
	}
	if (!/[A-Z]/.test(password)) {
		return false;
	}

	return true;
}

console.log(validatePassword("Abc12345")); // true

console.log(validatePassword("weak")); // false




// Ejercicio 2: Crear un sistema simple de gestión de tareas

function createTaskManager() {
	const tasks = [];

	return {
		addTask: (task) => {
			tasks.push(task);
		},

		completeTask: (taskId) => {
			tasks.splice(parseInt(taskId, 10) - 1, 1);
		},

		listTasks: () => {
			for (let i = 0; i < tasks.length; i++) {
				console.log(`${i + 1}. ${tasks[i]}`);
			}
		},
	};
}

// Uso:

const myTasks = createTaskManager();

myTasks.addTask("Aprender JavaScript");

myTasks.addTask("Hacer ejercicio");

myTasks.listTasks();

myTasks.completeTask(1);

console.log("Despues de completar una tarea:");
myTasks.listTasks();
